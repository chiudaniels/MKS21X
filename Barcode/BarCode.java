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
	_checkDigit = checkSum();
    }

    private static final String [] barcode ={"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
	
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum =0;
	for (int x=0; x<5; x++){
	    sum += _zip.charAt(x);
	}
	return  sum % 10;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String result="";
	for (int x=0; x<_zip.length(); x++){
	    result += barcode[_zip.charAt(x)];
	}
	return _zip + checkSum() + "  " + barcode;
    }


    public boolean equals(Object other){
	if (!other.getClass().equals(this.getClass())){
	    return false;
	}
	else {
	    return toString().equals(other.toString());
	}
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){
	if (Integer.parseInt(this._zip+this.checkSum()) > Integer.parseInt(other._zip+other.checkSum())){
	    return 1;
	}
	else if (Integer.parseInt(this._zip+this.checkSum()) ==  Integer.parseInt(other._zip+other.checkSum())){
	    return 0;
	}
	else{
	    return -1;
	}
    }
    // postcondition: compares the zip + checkdigit 

}
