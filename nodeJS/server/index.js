const http = require("http");
const fs = require("fs");

const server = http.createServer((req,res)=>{
  console.log(req);
  if(req.url==="/favicon.ico"){
    return res.end();
  }

  const log = `New request received at ${Date.now()} and url is ${req.url}`;
  fs.appendFile("./log.txt", log + "\n", (err) => {});
  // res.end("Hi User");

  switch(req.url){
    case "/":
      res.end("Welcome to home page");
      break;
    case "/about":
      res.end("Welcome to about page");
      break;
    case "/contact":
      res.end("Welcome to contact page");
      break;
    default:
      res.end("404 error page not found");
  }
})

server.listen("3000",()=>{
  console.log("server started");
});