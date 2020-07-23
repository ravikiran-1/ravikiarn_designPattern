package maven.design_pattern.AdapterPattern;

public class BirdAdapter implements ToyDuck {
	Bird bird; 
    public BirdAdapter(Bird bird) 
    {  
        this.bird = bird; 
    } 
  
    public void squeak() 
    { 
        bird.makeSound(); 
    }
}