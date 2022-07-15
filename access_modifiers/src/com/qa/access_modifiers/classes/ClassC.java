package com.qa.access_modifiers.classes;

class ClassC {

	public ClassC() {
		ClassB classB = new ClassB("some value");
		System.out.println(classB.protectedField);
		// can access the protected field as ClassB and ClassC
		// are in the same package.
		System.out.println("called ClassC constructor");
	}
}
