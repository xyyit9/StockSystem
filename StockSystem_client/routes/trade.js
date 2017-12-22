var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
    res.render('trade', { title: '交易' });
});

module.exports = router;