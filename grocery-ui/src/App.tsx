import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Jumbotron, Container, Nav, NavItem, NavLink } from 'reactstrap';
import { Switch, Route, Router } from 'react-router';
import CreateGroceryItem from './components/grocery-item-component/CreateGroceryItem';
import CreateGroceryList from './components/grocery-list-component/CreateGroceryList';
import Home from './components/homepage-component/Home';
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      
    
      <Home />
      <BrowserRouter>
      <Switch>
        <Route path="/createitem" component={ CreateGroceryItem }/>
        <Route path="/createlist" component={ CreateGroceryList }/>
      </Switch>
      </BrowserRouter>
  
    </div>
  );
}

export default App;
