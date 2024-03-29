import java.awt.*; 
import java.awt.Color;

public class T extends Tetromino {

  final static int[][][] shape = 
  {
    { { 0, 1, 0 },
      { 1, 1, 1 },
      { 0, 0, 0 }
    }, 
    { { 0, 1, 0 },
      { 0, 1, 1 },
      { 0, 1, 0 }
    },  
    { { 0, 0, 0 },
      { 1, 1, 1 },
      { 0, 1, 0 }
    }, 
    { { 0, 1, 0 },
      { 1, 1, 0 },
      { 0, 1, 0 }
    }, 
        
  }; 
  
  public Tetromino moveLeft( ) { return new T(this.x - Block.SIZE, 
                                              this.y, 
                                              this.direction ); }
  public Tetromino moveRight() { return new T(this.x + Block.SIZE, 
                                              this.y, 
                                              this.direction ); }
  public Tetromino moveUp(   ) { return new T(this.x, 
                                              this.y - Block.SIZE, 
                                              this.direction ); }
  public Tetromino moveDown( ) { return new T(this.x, 
                                              this.y + Block.SIZE, 
                                              this.direction ); }
  
  public Tetromino rotate() {
    int newDirection = (this.direction + 1) % 4;  
    return new T(this.x, this.y, newDirection); 
  }
  
  private void reset() {
    for (int i = 0; i < shape[direction].length; i++) 
      for (int j = 0; j < shape[direction][i].length; j++) 
        if (shape[direction][i][j] == 1)
          this.add( new Block( this.x + Block.SIZE * j, 
                               this.y + Block.SIZE * i, 
                               Color.YELLOW)
                              
                  );      
  }
  
  public T(int x, int y, int d) {
    super(x, y, d); 
    this.reset();             
  }
}