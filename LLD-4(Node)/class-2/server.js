const express = require("express");
let courses = [
    { id: 1, name: "java" },
    { id: 2, name: "python" },
    { id: 3, name: 'javascript' }
]
const app = express();
app.use(express.json());//built in middleware

function middleware1(req,res,next){
    console.log("This is middleware 1");
    next();
}
function middleware2(req,res,next){
    console.log("This is middleware 2");
    next();
}
function logger(req,res,next){
    console.log(req.method,req.ip,req.hostname,new Date());//methods (middleware)
}
app.use(middleware1);
app.use(middleware2);
app.use(logger);



app.get('/', (req, res) => {
    res.send("Hello from get method");
})
app.get('/about', (req, res) => {
    res.send("this is about");
})
app.get("/courses", (req, res) => {
    res.send(courses);
});
app.get('/courses/:id', (req, res) => {
    console.log(req.params)
    let course = courses.find(course => course.id === parseInt(req.params.id))
    if (!course) {
        res.status(404).send("The course dosent exit");
    }
})

//put is used to update entry or anything in the object
app.put('/courses/:id', (req, res) => {
    let course = courses.find(course => course.id === parseInt(req.params.id))
    if (!course) {
        res.status(404).send("The course dosent exit");
    }
    course.name = req.body.name
    res.send(courses);
})
//delete is delete anythig or entry in the array 
app.delete('/courses/:id', (req, res) => {
    let course = courses.find(course => course.id === parseInt(req.params.id))
    if (!course) {
        res.status(404).send("The course dosent exit");
    }
    const index = courses.indexOf(course);
    courses.splice(index, 1);
    res.send(courses);
})
app.post('/courses', (req, res) => {
    const course = {
        id: req.body.id,
        name: req.body.name
    }
    courses.push(course);
    res.send(courses);

})

app.listen(8083, () => {
    console.log("Server started on 3");
})
