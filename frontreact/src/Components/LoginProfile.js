import React, { Component } from 'react'

export default class LoginProfile extends Component {


	render() {
		return (
			<div class="text-end">
				<button type="button" class="btn btn-outline-light me-2">Login</button>
				<button type="button" class="btn btn-warning">Sign-up</button>
			</div>
		)
	}
}