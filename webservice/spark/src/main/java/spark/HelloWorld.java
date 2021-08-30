package spark;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
//    	port(6666); // Especificar uma porta para o Spark
        get("/hello", (req, res) -> "Hello World");
    }
}
