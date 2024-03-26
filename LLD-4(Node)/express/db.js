const mongoose = require('mongoose')

const DBurl = "mongodb+srv://aishwaryashirke111:3czSt7c9KelSuEfc@cluster0.rjozik5.mongodb.net/Scaler?retryWrites=true&w=majority"
mongoose.connect(DBurl).then(()=>{
    console.log("connection succesful");
}).catch(()=>{
    console.log("connection unscussesful")
})


//How to add data in our database
//Schema = Blueprint of data.
const courseSchema = new mongoose.Schema({
    name: String,
    creator: String,
    isPublished: Boolean,
    publishedDate:{type: Date ,default: Date.now},
    Ratings: Number,
});

//Model
const CourseModel = mongoose.model('Course',courseSchema);

//crate a documet(course entry)

async function crateCourse(){
    const course = new CourseModel({
        name: "Python",
        crateor: "Steve",
        isPublished:true,
        Ratings:4.5,
    });
    await course.save();
}
crateCourse();


//update a course
async function updateCourse(id){
    let course = await CourseModel.findById(id);
    if(!course) return 
    course.name = "DBMS";
    course.creator ="Aishwarya";
    await course.save();
}
updateCourse('65ccdca586743a825f271cce');


//Delete
async function deleteEntry(id){
    let courseDeleted = await CourseModel.findByIdAndDelete(id)
    console.log(courseDeleted);
}
deleteEntry('65ccdca586743a825f271cce');






