var express = require('express');
var path = require('path');
var favicon = require('serve-favicon');
var logger = require('morgan');
var cookieParser = require('cookie-parser');
var bodyParser = require('body-parser');

var dashboard = require('./routes/dashboard');
var main = require('./routes/main');
var grid=require('./routes/grid');
var jqgrid=require('./routes/jqgrid');
var register=require('./routes/register');
var register1=require('./routes/register1');
var echarts=require('./routes/echarts');
var lawerList=require('./routes/lawerList');
var kline=require('./routes/kline');

var withdrawalMoney=require('./routes/withdrawalMoney');
var saveMoney=require('./routes/saveMoney');
var addFund=require('./routes/addFund');
var reliefBind=require('./routes/reliefBind');
var userBind=require('./routes/userBind');
var corporationBind=require('./routes/corporationBind');

var app = express();
//转发代理
var proxy = require('express-http-proxy');
var apiProxy = proxy("localhost:8080",{
  proxyReqPathResolver:function(req){
    return require('url').parse(req.originalUrl).path;
  }
})
app.use('/user/login',apiProxy);
app.use('/manage/user/addUser',apiProxy);
app.use('/manage/corporation/addCorporation',apiProxy);
app.use('/manage/user/listUser',apiProxy);
app.use('/manage/user/lossReported',apiProxy);
app.use('/manage/user/deleteUser',apiProxy);
app.use('/manage/corporation/listCorporation',apiProxy);
app.use('/manage/user/lossReported',apiProxy);
app.use('/manage/corporation/deleteCorporation',apiProxy);

app.use('/manage/fund/withdrawalMoney',apiProxy);
app.use('/manage/fund/saveMoney',apiProxy);
app.use('/manage/fund/addFund',apiProxy);
app.use('/manage/fund/reliefBind',apiProxy);
app.use('/manage/fund/userBind',apiProxy);
app.use('/manage/fund/corporationBind',apiProxy);
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

app.use('/dashboard',dashboard);
app.use('/main',main);
app.use('/grid',grid);
app.use('/jqgrid',jqgrid);
app.use('/register',register);
app.use('/register1',register1);
app.use('/echarts',echarts);
app.use('/lawerList',lawerList);
app.use('/kline',kline);

app.use('/withdrawalMoney',withdrawalMoney);
app.use('/saveMoney',saveMoney);
app.use('/addFund',addFund);
app.use('/reliefBind',reliefBind);
app.use('/userBind',userBind);
app.use('/corporationBind',corporationBind);
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
