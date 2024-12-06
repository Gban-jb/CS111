public class LinearEquation {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int f;
	

// Constructor
public LinearEquation(int a, int b, int c, int d, int e, int f) {
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
	this.e = e;
	this.f = f;
}

// Getters 

public int getA() {
	return a;
}

public int getB() {
	return b;
}

public int getC() {
	return c;
}

public int getD() {
	return d;
}

public int getE() {
	return e;
}

public int getF() {
	return f;
}


public boolean isSolveable(int a, int b, int c, int d) {
	if(a*d - b*c != 0) {
		return true;
	}
	else
		return false;
}

public int getX() {
	if(isSolveable(a, b, c, d)) {
	int x = (e*d - b*f)/(a*d-b*c);
	return x;}
	else {
		return -1;
	}
}


public int getY() {
	if(isSolveable(a,b,c,d)) {
	int y = (a*f-e*c)/(a*d-b*c);	
	return y;
}
	else {
		return -1;
	}
}
}












