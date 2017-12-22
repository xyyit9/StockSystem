var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');


var main = require('./routes/main');
var echarts=require('./routes/echarts');
var timeSharingChart=require('./routes/timeSharingChart');
var comm=require('./routes/comm');
var trade=require('./routes/trade');
var login=require('./routes/login');
var app = express();
//转发代理
var proxy = require('express-http-proxy');
var apiProxy = proxy("localhost:8080",{
  proxyReqPathResolver:function(req){
    return require('url').parse(req.originalUrl).path;
  }
})
var echartProxy = require('express-http-proxy');
var echartApiProxy = echartProxy("http://money.finance.sina.com.cn",{
    proxyReqPathResolver:function(req){
        return require('url').parse(req.originalUrl).path;
    }
})

var sinaProxy = require('express-http-proxy');
var sinaApiProxy = sinaProxy("http://web.juhe.cn:8080",{
    proxyReqPathResolver:function(req){
        return require('url').parse(req.originalUrl).path;
    }
})
app.use('/quotes_service/api/json_v2.php/CN_MarketData.getKLineData',echartApiProxy);

app.use('/finance/stock/hs',sinaApiProxy);
app.use('/client/user/login1',apiProxy);
app.use('/client/user/commListById',apiProxy);
app.use('/client/user/transactionList',apiProxy);
app.use('/client/user/positionList',apiProxy);
app.use('/client/user/myBank',apiProxy);
app.use('/client/transaction/addComm',apiProxy);
// view engine setup
app.set('views', path.join(__dirname, 'views'));
app.engine('.html', require('ejs').__express);
app.set('view engine', 'html');

// uncomment after placing your favicon in /public
//app.use(favicon(path.join(__dirname, 'public', 'favicon.ico')));
app.use(logger('dev'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(cookieParser());
app.use(express.static(path.join(__dirname, 'public')));


app.use('/main',main);
app.use('/echarts',echarts);
app.use('/timeSharingChart',timeSharingChart);
app.use('/comm',comm);
app.use('/login',login);
app.use('/trade',trade);


// catch 404 and forward to error handler
app.use(function(req, res, next) {
  var err = new Error('Not Found');
  err.status = 404;
  next(err);
});

// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  res.locals.message = err.message;
  res.locals.error = req.app.get('env') === 'development' ? err : {};

  // render the error page
  res.status(err.status || 500);
  res.render('error');
});


module.exports = app;
