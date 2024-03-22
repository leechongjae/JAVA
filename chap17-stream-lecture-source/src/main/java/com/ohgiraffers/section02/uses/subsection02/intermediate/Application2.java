package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {

	public static void main(String[] args) {

		/* 수업목표. 스트림의 중계연산중 하나인 map에 대해 이해하고 사용할 수 있다. */
		/* 필기.
		 *  Stream<R> map(Function<? super T, ? extends R> mapper);
		 *  스트림에 들어있는 데이터를 특정 람다식을 통해 데이터를 가공하고 새로운 스트림에 담아주는 역할을 한다.
		 * */
		IntStream intStream = IntStream.range(1, 10);
		intStream
			.filter(i -> i % 2 == 0)	// boolean 반환형으로 람다식 작성(Predicate)
			.map(i -> i * 5)			// 요소를 반환하는 형태로 람다식 작성(Operator)
			.forEach(result -> System.out.print(result + " "));		// 반환형 없는 람다식 작성(Consumer)

	}

}
