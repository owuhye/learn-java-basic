package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
//        MovieReview[] movie = new MovieReview[]{inception, aboutTime};
//        MovieReview[] movie = {inception, aboutTime};
        MovieReview[] reviews = new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화!";
        reviews[1] = aboutTime;

        // 향상된 for문
        for (MovieReview review : reviews) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: " + review.review);
        }

        //for문
        for (int i = 0; i < reviews.length; i++) {
        System.out.println("영화 제목: " + reviews[i].title + ", 리뷰: " + reviews[i].review);
        }

        for (int i = 0; i < reviews.length; i++) {
            MovieReview m = reviews[i];
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
        }

    }
}
