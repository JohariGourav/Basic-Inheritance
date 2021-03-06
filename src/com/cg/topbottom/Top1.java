//Class Top1 with disp method overrided by 3 child classes

package com.cg.topbottom;

//class top1
public class Top1 {

	// disp method
	public void disp() {
		System.out.println("this is top1 class");
	}
}

// class bottom extending Top1
class Bottom1 extends Top1 {
	@Override
	public void disp() {
		System.out.println("this is bottom1 class");
	}
}

// class bottom2 extending Top1
class Bottom2 extends Top1 {
	@Override
	public void disp() {
		System.out.println("this is bottom2 class");
	}
}

// class bottom3 extending Top1
class Bottom3 extends Top1 {
	@Override
	public void disp() {
		System.out.println("this is bottom3 class");
	}
}