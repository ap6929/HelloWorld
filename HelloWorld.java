public class HelloWorld {
public static void main(String[] args) {
	String names = "World";
	if (args.length > 0){
		names = String.join(",",args);
	}
}
}
	