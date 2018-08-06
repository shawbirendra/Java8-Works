package com.training.day3;

import java.util.ArrayList;
import java.util.List;

class MyTuple<A, B, C> {
	private A _aa;
	private B _bb;
	private C _cc;

	public MyTuple() {
		// TODO Auto-generated constructor stub
	}

	public MyTuple(A _aa, B _bb, C _cc) {
		super();
		this._aa = _aa;
		this._bb = _bb;
		this._cc = _cc;
	}

	public A get_aa() {
		return _aa;
	}

	public void set_aa(A _aa) {
		this._aa = _aa;
	}

	public B get_bb() {
		return _bb;
	}

	public void set_bb(B _bb) {
		this._bb = _bb;
	}

	public C get_cc() {
		return _cc;
	}

	public void set_cc(C _cc) {
		this._cc = _cc;
	}

}

public class TupleEx01 {
	public static MyTuple<Integer, String, Boolean> newTuple() {
		return new MyTuple<>(100, "Hello", true);
	}

	public static void main(String[] args) {
		MyTuple<Integer, String, Boolean> tuple1 = newTuple();
		System.out.println("Integer Value:" + tuple1.get_aa());
		System.out.println("String Value:" + tuple1.get_bb());
		System.out.println("Boolean Value:" + tuple1.get_cc());
		List<MyTuple<Integer, String, Boolean>> myList = new ArrayList<>();
		System.out.println(myList);
	}
}
