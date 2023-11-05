import React, { Component } from 'react'

export default class LoginProfile extends Component {


	render() {
		return (
			<div className="text-end">
				<a href="/login" type="button" className="btn btn-outline-light me-2">Login</a>
				<a type="button" className="btn btn-warning">Sign-up</a>
			</div>
		)
	}
}