package com.enums.demo;

public enum Size {

	SMALL(1) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return null;
		}
	},MEDIUM(2) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return null;
		}
	},LARGE(3) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return "Large asLowerCase() ";
		}
	},XTRALARGE(4) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return null;
		}
	},XTRASMALL(0) {
		@Override
		public String asLowerCase() {
			// TODO Auto-generated method stub
			return null;
		}
	};
	
	private int value;
	
	Size(int value){
		this.value = value;
	}
	
	public abstract String asLowerCase();
	
	public String allUse() {
		return "good we are all using this";
	}
}

/*
Enums are a list of predefined constants


the problem with java 1.5 is that it is not object Oriented. you can't extend an enum and you can't add an element in existing enum. 


Enums are considered to be special type of class.

An Enum class can include constants,methods like regular class.

Enums are Thread safe by default.





*/