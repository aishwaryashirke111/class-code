class person{
    constructor(name,height,age,color,){
        this.name = name;
        this.height = height;
        this.age = age;
        this.color= color;
    }
    //instanec methods we have created inctance method of person 
    walk(){
        console.log(`${this.name} is walking towards me`);
    }
    Height(){
        console.log(`${this.age} is his age`);
    }
    //static method can be call only using class not the instances of a class  because static contect instances cant be access 
    static greeting(){
        console.log(`hello geetings from me`);
    }
}
//instance of class of person
const Aish = new person("Aishwarya","5.2","23","fair");
const somy = new person("somesh","5.9","32","fair");

console.log(Aish);
console.log(somy);
//instance method calling
Aish.walk();
somy.Height();
person.greeting();