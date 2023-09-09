import { Component, React } from "react"


export default class Home extends Component {
	render() {
		return (
			<div>
				Hello home
				<div className="dropdown">
					<button className="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuLink" data-bs-toggle="dropdown">
						Dropdown link
					</button>

					<ul className="dropdown-menu" aria-labelledby="dropdownMenuLink">
						<li><a className="dropdown-item" href="1">Action</a></li>
						<li><a className="dropdown-item" href="2">Another action</a></li>
						<li><a className="dropdown-item" href="3">Something else here</a></li>
					</ul>
				</div>
			</div>
		)
	}
}