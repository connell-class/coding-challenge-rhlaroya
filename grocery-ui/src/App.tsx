import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Jumbotron, Container, Nav, NavItem, NavLink } from 'reactstrap';
import { Switch, Route } from 'react-router';
import CreateGroceryItem from './components/grocery-item-component/CreateGroceryItem';
import CreateGroceryList from './components/grocery-list-component/CreateGroceryList';

function App() {
  return (
    <div className="App">
      <div>
      {/* <Jumbotron fluid>
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
      </Nav> */}
      
      <Switch>
        <Route path="/createitem" component={ CreateGroceryItem }/>
        <Route path="/createlist" component={ CreateGroceryList }/>
      </Switch>
    </div>
    </div>
    
  );
}

export default App;
