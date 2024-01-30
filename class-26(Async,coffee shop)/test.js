function placeOrder(drink) {
    return new Promise((resolve, reject) => {
        if (drink == 'coffee') {
            resolve("Order has been placed")
        } else {
            reject("Order cannot be placed");
        }
    })
}

function processOrder(orderPlaced) {
    return new Promise((resolve) => {
        resolve(`${orderPlaced}and served`);
    })
}
// placeOrder('coffee').then(function(orderStatus){
//     console.log(orderStatus);            


// })
async function serveOrder() {
    try {
        let orderTaken = await placeOrder('tea');
        console.log(orderTaken);
        let proceesedOrder = await processOrder(orderTaken);
        console.log(proceesedOrder)

    } catch (err) {
        console.log(err);

    }

}
serveOrder();