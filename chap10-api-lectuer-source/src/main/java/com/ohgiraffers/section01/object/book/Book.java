package com.ohgiraffers.section01.object.book;

import java.util.Objects;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(int number, String title, String author, int price) {

        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /* 목차. 1. toString() 오버라이딩 */
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    /* 목차. 2. equals() 오버라이딩 */

    @Override
    public boolean equals(Object o) {

        /* 설명. 가장 먼저 두 인스턴스의 주소가 같다면 아래 조건들을 판단할 것도 없이 동일한 객체이므로 true를 반환 */
        if (this == o) {
            return true;
        }

        /* 설명. 비교 대상 객체가 null이라는 것은 애초에 존재하지도 않는 객체이므로 false를 반환 */
        if (o == null) {
            return false;
        }

        /* 설명. 전달인자 o를 Book 타입으로 형변환하여 각 필드를 비교해본다. */
        Book otherBook = (Book) o;
        /* 설명. number 필드의 값이 서로 다른 경우, 두 인스턴스는 서로 다른 인스턴스다. */
        if (this.number != otherBook.number) {
            return false;
        }

        /* 설명
         *  title 필드의 값이 null인 경우 전달 인자의 title 필드에도 null 값이 저장되어 있어야 서로 같은 값을
         *  가지고 있다고 말할 수 있다.
         *  그렇지 않은 경우 false를 반환함.
        * */
        if(this.title == null) {

            /* 설명. title 필드가 null인 경우, 다른 인스턴스의 title 필드가 null이 아니라면 false를 반환. */
            if(otherBook.title != null) {
                return false;
            }
        } else if(!this.title.equals(otherBook.title)) {

            /* 설명.
             *  String 클래스의 equals()는 이미 해당 기능을 오버라이딩 해 두었기 때문에
             *  같은 값을 가지는지 비교를 한다.
             * */

            /* 설명.
             *  title필드가 null이 아닌 경우
             *  두 인스턴스의 title 필드값이 같아야 한다.
             *  그렇지 않은 경우 false 반환
             * */
            return false;
        }

        /* 설명. 작가의 경우도 마찬가지로 비교한다. */
        if(this.author == null) {

            if(otherBook.author != null) {
                return false;
            }

        } else if(!this.author.equals(otherBook.author)) {

            return false;
        }

        /* 설명. price 필드가 서로 다른 값을 가지면 false 반환 */
        if(this.price != otherBook.price) {
            return false;
        }

        /* 설명. 모든 조건을 통과하면 두 인스턴스의 모든 필드는 같은 값을 가지므로 true 반환 */
        return true;
    }

    /* 목차. 3. hashCode() 오버라이딩 */
    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }
}
