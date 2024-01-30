class person{
    //creating class
    constructor(name,age,height,color){
        this.name = name;
        this.age = age
        this.height = height;
        this.color = color;
    }
}

//class teacher extends person iherites properties and methods ,objects from person class
class Teacher extends person{
    //using contructor we can define new values and old values  from parent class
    constructor(name,age,height,color,experience,subject){
        //using super keyward we can accees,use the parent class values or objects 
        //super keyward will call parent class methods and objects.
        super(name,age,height,color)
        this.experience= experience;
        this.subject= subject;
        }
}

const dummyTeacher = new Teacher("Aishu","23","5.4","fair","1.5","DSA");
console.log(dummyTeacher);