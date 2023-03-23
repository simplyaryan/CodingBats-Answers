public String fizzString(String str) {
 if (str.substring(0, 1).equals("f") && str.substring(str.length()-1).equals("b")){
   return "FizzBuzz";
 }
 else if (str.substring(0, 1).equals("f")){
   return "Fizz";
 }
 else if (str.substring(str.length()-1).equals("b")){
   return "Buzz";
 }
 else {
   return str;
 }
}
