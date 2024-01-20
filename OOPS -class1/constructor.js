function car(name,speed,engine,color){
    this.name = name
    this.speed = speed;
    this.engine = engine;
    this.color = color;
}

const car1 = new car("Thar","100","petrol","black");
console.log(car1);