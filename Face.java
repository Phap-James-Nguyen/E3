public class Face {

    private Point a;
    private Point b;
    private Point c;

    public Face(Point a, Point b, Point c)
    {
        this.a = a;
        this.b = b;
        this.c = c;

        double area = 0.0;
        area = this.area();

        if(area <= 0)
        {
            throw new FaceException("Face can't have zero or less than area");
        }

        double distance1 = this.a.distance(b);
        double distance2 = this.b.distance(c);
        double distance3 = this.c.distance(a);

        double equidistant = 0.0;

        if(Math.abs(distance1 - distance2) < equidistant &&
                Math.abs(distance2 - distance3) < equidistant &&
                Math.abs(distance3 - distance1) < equidistant)
        {
            // All three points are equidistant
        }
        else // do this if points are not equidistant
        {
            throw new FaceException("All three points must be equidistant ");
        }


    }

    //@Override
    public boolean equals(Object other)
    {
        //An override of method equals that returns true only if all the points of the Face are
        //equal.

        if(other == null){return false;}


        boolean boo = false;

        if(other instanceof Face) {

            Face face = (Face) other;

            if ((this.a.equals(face.a) || this.a.equals(face.b) || this.a.equals(face.b)) &&
                    (this.b.equals(face.a) || this.b.equals(face.b) || this.b.equals(face.b)) &&
                    (this.c.equals(face.a) || this.c.equals(face.b) || this.c.equals(face.b)))
            {
                boo = true;
                return boo;
            }
        }

        return boo;

    }

    public String toString()
    {
        String result = "";

        result += "[{ " + this.a.toString() + "}" + "-" + "{" + this.b.toString() + "}" + "-" + "{" + this.c.toString() + "}]";



        return result;

    }

     public boolean adjacent(Face other)
    {
        //two face are adjacents if they shared two of the same points
        boolean boo = false;

        if(this.a.equals(other.a) || this.a.equals(other.b) || this.a.equals(other.c))
        {
            if(this.b.equals(other.a) || this.b.equals(other.b) || this.b.equals(other.c))
            {
                boo = true;

                return boo;
            }

            else if(this.c.equals(other.a) || this.c.equals(other.b) || this.c.equals(other.c))
            {
                boo = true;

                return boo;
            }
        }

        else if(this.b.equals(other.a) || this.b.equals(other.b) || this.b.equals(other.c))
        {
            if(this.a.equals(other.a) || this.a.equals(other.b) || this.a.equals(other.c))
            {
                boo = true;

                return boo;
            }

            else if(this.c.equals(other.a) || this.c.equals(other.b) || this.c.equals(other.c))
            {
                boo = true;

                return boo;
            }
        }

        else if(this.c.equals(other.a) || this.c.equals(other.b) || this.c.equals(other.c))
        {
            if(this.a.equals(other.a) || this.a.equals(other.b) || this.a.equals(other.c))
            {
                boo = true;

                return boo;
            }

            else if(this.b.equals(other.a) || this.b.equals(other.b) || this.b.equals(other.c))
            {
                boo = true;

                return boo;
            }
        }

        return boo;
    }


    public double edge()
    {
        double edge = 0.0;

        edge = this.a.distance(this.b);

        return edge;
    }




    public double area()
    {
        double area = 0.0;

        area = (Math.sqrt(3) / 4) * Math.pow(edge(),2);
        return area;

    }



}
