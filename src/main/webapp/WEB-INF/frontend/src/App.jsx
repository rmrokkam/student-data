import './App.css'
import FooterComponent from './components/FooterComponent'
import HeaderComponent from './components/HeaderComponent'
import ListStudentComponent from './components/ListStudentComponent'
import { BrowserRouter, Routes, Route } from 'react-router-dom'

function App() {
	
	return(
		<>
			<BrowserRouter>
				<HeaderComponent />
				<Routes>
					{/* http://localhost:3000 */}
					<Route path='/' element={<ListStudentComponent/>} ></Route>
					{/* http://localhost:3000/students */}
					<Route path='/students' element={<ListStudentComponent/>} ></Route>
				</Routes>
				<FooterComponent />
			</BrowserRouter>
		</>
	)
	
}

export default App