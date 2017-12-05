import React, { Component } from 'react';
import { Platform } from 'react-native';
import { StackNavigator, TabNavigator } from 'react-navigation';

import PrimeraPantalla from './scenes/PrimeraPantalla'
import SegundaPantalla from './scenes/SegundaPantalla'
import TerceraPantalla from './scenes/TerceraPantalla'

const tabBarOptions = (Platform.OS === 'android') ?
  {
    style: { backgroundColor: '#303F9F' },
    indicatorStyle: { backgroundColor: '#FF4081' },
  } :
  {};

const tabNavigatorConfig = {
  backBehavior: 'none',
  tabBarPosition: 'bottom',
  tabBarOptions,
};

const Navegador1 = StackNavigator(
  {
    PrimeraPantalla: { screen: PrimeraPantalla },
    Navegador2: { screen: Navegador2 },
  },
  {
    initialRouteName: 'PrimeraPantalla',
    
  },
);
const Navegador2 = TabNavigator(
  {
    SegundaPantalla: { screen: SegundaPantalla },
    TerceraPantalla: { screen: TerceraPantalla },
  },
  {
    initialRouteName: 'SegundaPantalla',
    tabNavigatorConfig,
  },
);

export default class App extends Component {
  render() {
    return (
      <Navegador1 />
    );
  }
}


