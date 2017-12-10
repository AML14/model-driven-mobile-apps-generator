import React, { Component } from 'react';
import {
  Image,
  View,
  ScrollView,
} from 'react-native';
import {
  Container,
  Header,
  Title,
  Content,
  Icon,
  Button,
  Left,
  Right,
  Body,
  Text,
  Card,
  CardItem,
  List,
  ListItem,
  Item,
  Input,
  Radio,
  Picker,
  Form,
} from 'native-base';
import { NavigationActions } from 'react-navigation';

const navBack = NavigationActions.back();

class TerceraPantalla extends Component {
  static navigationOptions = {
    header: null,
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }} />
          <Body style={{ flex: 6 }}>
            <Title>Tercera Pantalla</Title>
          </Body>
          <Right style={{ flex: 1 }}>
            <Button transparent>
              <Icon name="menu" />
            </Button>
          </Right>
        </Header>
      </Container>
    );
  }
}

export default TerceraPantalla;
