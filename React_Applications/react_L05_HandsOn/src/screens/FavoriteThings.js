import React from 'react';
import Thing from './Thing';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';

const FavoriteThings = ({match}) => (
    <div>
        <h2>Favorite Things</h2>

        <ul>
            <li><Link to={`${match.url}/toyota-camry`}>Favorite Car</Link></li>
            <li><Link to={`${match.url}/posole`}>Favorite Food</Link></li>
            <li><Link to={`${match.url}/the-avengers`}>Favorite Movie</Link></li>
        </ul>

        <Route path={`${match.url}/:thingId`} component={Thing}/>
        <Route exact path={match.url} render={() => <h3>Please select a thing</h3>}/>
    </div>
);

export default FavoriteThings;