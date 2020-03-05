import React from "react"
import { Jumbotron, Container, Nav, NavItem, NavLink } from "reactstrap"

const Home = () => {
    return(
      <div className="App">
      <div>
      <Jumbotron fluid>
        <Container fluid>
          <h1 className="display-3">Waltzmartz Grocery App</h1>
        </Container>
      </Jumbotron>
      <div>
      <p>Grocery List</p>
      <Nav vertical>
        <NavItem>
          <NavLink href="#">Create Grocery List</NavLink>
        </NavItem>
      </Nav>
      </div>
      </div>
      </div>
    )
}

export default Home