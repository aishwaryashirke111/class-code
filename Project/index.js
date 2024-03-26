const express = require("express");

const { connectMongoDb } = require("./connection");
const productRoutes = require("./routes/productRoutes");
const PORT = 8082;

const DBurl =
  "mongodb+srv://aishwaryashirke111:3czSt7c9KelSuEfc@cluster0.rjozik5.mongodb.net/?retryWrites=true&w=majority";
connectMongoDb(DBurl);

const app = express();
app.use(express.json());

app.use("/api/products/", productRoutes);



// Add a product

app.listen(PORT, () => {
  console.log("Server Started");
});