<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<script>
    // let nums = [1, 2, 3];
    // nums.forEach(function(n) {
    //     console.log(n * 2);
    // });
    // 출력: 2, 4, 6
    //reduce
    // - **개념**: 배열의 모든 요소를 순회하면서, **이전 값(accumulator)**과
    // **현재 값(current)**을 합쳐서 **하나의 결과**를 만듭니다.
    // - **반환값**: 누적된 결과값(숫자, 문자열, 객체 등 자유롭게 가능).
    // let nums = [10, 20, 30];
    // let sum = nums.reduce((acc, cur) => acc + cur, 0);
    // console.log(sum); // 60

    //  3. `for ... in`
    // - **개념**: 객체(object)의 **키(key)**를 반복합니다.
    // - 배열에 쓰면 **인덱스**가 나옵니다.
    // let obj = { name: "Tom", age: 25 };
    // for(let key in obj){
    //     console.log(key, obj[key]);
    // }

    // ## `map()`
    // - **개념**: 배열의 각 요소를 가공해서 **새로운 배열**을 반환합니다.
    // - `forEach`와 달리 **반환값**이 있다는 점이 중요합니다.

    // let nums = [1, 2, 3];
    // //let doubled = nums.map(n => n * 2);
    // let doubled=nums.map(function(n){return n*2});
    // console.log(doubled);
    //
    // let fun=function(f){alert('test'); f()}
    // fun(function (){alert('test2')});

    //## `filter()`
    //개념**: 조건을 만족하는 요소만 모아서 새로운 배열 반환.
    // let nums = [5, 10, 15, 20];
    // //let over10 = nums.filter(n => n > 10);
    // let f=function(n){return n>10};
    // let over10=nums.filter(f);
    // console.log(over10);
//`find()`

  //개념**: 조건을 만족하는 **첫 번째 요소를 반환.
    let nums = [5, 10, 15, 20];
    //let firstOver10 = nums.find(n => n > 10);
    let firstOver10=nums.find(function(n){
       return n>10;
    });
    console.log(firstOver10); // 15
</script>