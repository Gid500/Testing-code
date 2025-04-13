
function Food() {

    const food1 = "Orange";
    const food2 = "Banana";

    return(
        <ul>
            <li>Apple</li>
            <li>{food1}</li> {/* 자바의 클래스 객체와 유사한 형식으로 자바스크립트 함수의 food1을 html의 돔 형식으로 리턴 가능함 */}
            <li>{food2.toUpperCase()}</li> {/* 그 함수에 접근하여 다른 함수를 사용 가능함 */}
        </ul>
    );
}

{/* Food라는 돔을 객체와 유사하게 export 시킴 */}
export default Food 