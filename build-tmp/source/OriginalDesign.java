import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

public void setup()
{
size(500,300);
background (130, 207, 235);
}
public void draw()
{
body();
eye();
mouth();
}

public void body()
{
noStroke ();
fill (175, 198, 209);
beginShape (); 
vertex (36, 158);
bezierVertex (570, -164, 451, 485, 36, 158);
endShape ();
fill (56, 61, 122);
beginShape (); 
vertex (33, 159);
bezierVertex (557, -142, 464, 367, 33, 157);
endShape ();
fill (56, 61, 122);
arc (30, 169, 59, 64, PI+QUARTER_PI, TWO_PI+HALF_PI+PI/8, PIE);

}

public void eye()
{
fill (240, 232, 232);
ellipse (350, 116, 30, 30);
stroke (5, 3, 3);
strokeWeight(15);
point (355, 112);	
}

public void mouth()
{
strokeWeight (8);
noFill();
stroke (51, 32, 32);
arc(376, 172, 24, 14, 0, HALF_PI+QUARTER_PI);	
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
