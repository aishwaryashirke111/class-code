const express = require("express");
let courses =[
    {id:1, name :"java"},
    {id:2, name:"python"},
    {id:3, name:'javascript'}
]
const app = express();


app.get('/',(req,res)=>{
    res.send("Hello from get method");
})
app.get('/about',(req,res)=>{
    res.send("this is about");
})
app.get('/courses/:id',(req,res)=>{
    console.log(req.params)
    let course = courses.find(course =>course.id ===parseInt(req.params.id))
    res.send(courses);
})

app.listen(8083,()=>{
    console.log("Server started on 3");
})
