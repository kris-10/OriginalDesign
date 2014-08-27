void setup()
{
size(500,300);
background (129, 207, 235);
}
void draw()
{
body();
eye();
mouth();
}

void body()
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

void eye()
{
fill (240, 232, 232);
ellipse (350, 116, 30, 30);
stroke (5, 3, 3);
strokeWeight(15);
point (355, 112);	
}

void mouth()
{
strokeWeight (8);
noFill();
stroke (51, 32, 32);
arc(376, 172, 24, 14, 0, HALF_PI+QUARTER_PI);	
}
