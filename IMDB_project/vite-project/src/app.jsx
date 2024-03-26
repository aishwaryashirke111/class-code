import Banner from "./components/Banner";
import NavBar from "./components/NavBar";
import Movies from './components/Movies';
import watchList from './components/WatchList'
import {BrowserRouter,Routes,Route} from 'react-router-dom'


export function App() {
    return (
    <>
    <BrowserRouter>
      <NavBar/>
      <Routes>
        <Route path="/" element={<><Banner/><Movies/></>}/>
        <Route path="/watchlist" element={<watchList/>}/>
      
      </Routes>
      </BrowserRouter>
    </>
  )
}
