package com.company;

public class Main {

    public static void main(String... args) {

        Movie movie1 = new Movie("Matrix", 0);
        Movie movie2 = new Movie("Avengers", 0);
        Movie movie3 = new Movie("Spider man", 0);
        Movie movie4 = new Movie("Batman", 0);
        Movie movie5 = new Movie("Titanic", 0);

        Movie[] movies = {movie1, movie2, movie3, movie4, movie5};

        MoviesController.likeMovies(movies, 7);
        MoviesController.print(movies);



     Vote person = new Vote("Ana", "MD", 25);
     Vote person1 = new Vote("Ion", "Moldova", 17);
     Vote person2 = new Vote("Mia", "USA", 27);
     person.setStatus("MD", 25);
     person1.setStatus("MD", 17);
     person2.setStatus("MD", 27);


   //     Student student = new Student( "ion", 22 );
   //     student.setName("ana");
//     System.out.println(student.getName());

        //   Triangle triangle = InputController.createTriangle();
     //   OutputController.printAreaAndPerimeter(triangle);
     //   Square square = InputController.createSquare();
     //   OutputController.printAreaAndPerimeter(square);
     //   Circle circle = InputController.createCircle();
     //   OutputController.printAreaAndPerimeter(circle);


    }
}




