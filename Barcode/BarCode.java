public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	_zip = zip;
	int sum =0;
	for (int x=0; x<5; x++){
	    sum += zip.charAt(x);
	}
	_checkDigit= sum % 10;
    }

    static final String [] barcode ={"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"}
	
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){}


    //post: computes and returns the check sum for _zip
    private int checkSum(){}

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){}


    public boolean equals(Object other){}
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){}
    // postcondition: compares the zip + checkdigit 

}
