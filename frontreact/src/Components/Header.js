import React, { Component } from "react";
import { Navbar, Nav, Container, FormControl, Form, Button } from "react-bootstrap";
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import 'bootstrap/dist/css/bootstrap.min.css';
import logo from "../images/logo.png" 

import Home from "../Pages/Home"
import Light from "../Pages/Light"
import Info from "../Pages/Info"

export default  class Header extends Component {
	render() {
		return (
			<>
			<Navbar collapseOnSelect expand="md" bg="dark" variant="dark">
				<Container>
					<Navbar.Brand href="/" >
						<img
							src={logo}
							height="30"
							width="30"
							className="d-inline-block align-top"
							alt="Logo"
						/>
					</Navbar.Brand>
					<Navbar.Toggle aria-controls="responsive-navbar-nav" />
					<Navbar.Collapse id="responsive-navbar-nav" >
						<Nav className="me-auto">
							<Nav.Link href="/"> Home </Nav.Link>
							<Nav.Link href="/light"> Light </Nav.Link>
							<Nav.Link href="/info"> Info </Nav.Link>
						</Nav>
						<Form className="d-flex">
							<FormControl
								type="text"
								placeholder="Search"
								className="mr-sm-2"
							/>
							<Button className="ml-10" variant="outline-info">Search</Button>
						</Form>
					</Navbar.Collapse>
				</Container>
			</Navbar>

			<Router>
					<Switch>
						<Route exact path="/" component={Home}/>
						<Route exact path="/light" component={Light}/>
						<Route exact path="/info" component={Info}/>
					</Switch>
				</Router>
			</>
		)
	}
}