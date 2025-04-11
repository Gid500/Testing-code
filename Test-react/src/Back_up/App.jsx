import Header from "./Header.jsx"
import Footer from "./Footer.jsx"
import Food from "./Food.jsx";

function App() {

  return(
    // 사용할 메인 페이지에는 <></>를 문법적으로 사용해야함 
    <>
      <Header></Header>
      <Food></Food>
      <Food></Food> {/* 리엑트의 재사용성 */}
      <Footer></Footer>
    </>
  );
}

export default App
