var http = require('http');
var vue = require('vue')

var app = new vue({
    el: '#app',
    data: {
      message: 'Hello Vue!'
    }
})

http.createServer(function (req, res) {
    res.writeHead(200, {'Content-Type': 'text/plain'});
    res.end('Hello World\n');
}).listen(1337, "127.0.0.1");
console.log('Server running at http://127.0.0.1:1337/');