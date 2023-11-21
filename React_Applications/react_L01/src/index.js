import React from 'react';
import ReactDOM from 'react-dom';

const applesPrice = React.createElement('li', {}, '$1.00 per pound');
const orangesPrice = React.createElement('li', {}, '$0.70 per pound');
const mangosPrice = React.createElement('li', {}, '$2.00 per pound');
const apples = React.createElement('ul', {}, applesPrice);
const oranges = React.createElement('ul', {}, orangesPrice);
const mangos = React.createElement('ul', {}, mangosPrice)

ReactDOM.render(
    React.createElement(
        'ul', {}, 
        React.createElement('li', {}, 'Apples', apples), 
        React.createElement('li', {}, 'Oranges', oranges), 
        React.createElement('li', {}, 'Mangos', mangos)
    ), 
    document.getElementById('root')
);