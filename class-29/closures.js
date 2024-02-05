function a(){
    var a = 20;
    function b(){
        var b = 30;
        function c(){
            console.log(b);
            console.log(a);
        }
        c();
    }
    b();
}
a();