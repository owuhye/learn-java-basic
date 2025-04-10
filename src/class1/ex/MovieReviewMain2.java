package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화!";

//        MovieReview[] movie = new MovieReview[]{inception, aboutTime};
        MovieReview[] movie = {inception, aboutTime};

        // 향상된 for문
        for (MovieReview m : movie) {
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

        //for문
        for (int i = 0; i < movie.length; i++) {
        System.out.println("영화 제목: " + movie[i].title + ", 리뷰: " + movie[i].review);
        }

        for (int i = 0; i < movie.length; i++) {
            MovieReview m = movie[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

    }
}
