import java.awt.*; 
import java.util.*; 

public abstract class Tetromino extends ArrayList<Block> {
  
  public static Tetromino random() {
    int i = (int)(Math.random() * 3);    
    switch (i) {
      case 0: return new T(20, 50, 1); 
      case 1: return new Z(20, 50, 1); 
      default: return new L(20, 50, 1); 
    }
  }
  public Color randomColor()
{
  Random random=new Random(); /////////////////
  int red=random.nextInt(256);
  int green=random.nextInt(256);
  int blue=random.nextInt(256);
  return new Color(red, green, blue);
}
  protected int x, y; 
  protected int direction; 
  public Tetromino(int x, int y, int direction) {
    super(); 
    this.x = x; 
    this.y = y; 
    this.direction = direction; 
  }
  public void draw(Graphics g) {
    for (Block b : this)
      b.draw(g); 
  }
  public abstract Tetromino moveLeft(); 
  
  public abstract Tetromino moveRight(); 

  public abstract Tetromino moveUp(); 

  public abstract Tetromino moveDown(); 
  public abstract Tetromino rotate(); 
}