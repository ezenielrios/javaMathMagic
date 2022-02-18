public class Magic {
	public static void main(String[] args) {
    int myNumber = 100;
    //myNumber will be the original number going forward
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;
    System.out.println(stepSix);

	}
}

  /*Recreate this project using only two variables: myNumber and magicNumber. Use compound assignment operators to recreate the above program by only manipulating magicNumber.*/ 
