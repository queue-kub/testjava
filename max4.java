void main() {
    IO.println("Hello Word");
    int a = 10;
    int b = 5;
    int c = 2;
    if ((a > b) && (a > c)) {
        IO.println("max : A");
    }else{
            if ((b > a) && (b > c)) {
                IO.print("Max : B");
            } else {

                IO.print("Max : c");
            }
        }
    }
}
