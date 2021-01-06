class AnimalSounds {  
void eat(){System.out.println("eating...");}  
}  
class Dog extends AnimalSounds{  
void eat(){System.out.println("eating bread...");}  
}  
class Cat extends AnimalSounds{  
void eat(){System.out.println("eating rat...");}  
}  
class Lion extends AnimalSounds{  
void eat(){System.out.println("eating meat...");}  
}  
class TestPolymorphism3{  
public static void main(String[] args){  
AnimalSounds a;  
a=new Dog();  
a.eat();  
a=new Cat();  
a.eat();  
a=new Lion();  
a.eat();  
}}  