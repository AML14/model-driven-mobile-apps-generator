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

class PrimeraPantalla extends Component {
  static navigationOptions = {
    header: null,
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }} />
          <Body style={{ flex: 6 }}>
            <Title>Primera Pantalla</Title>
          </Body>
          <Right style={{ flex: 1 }}>
            <Button transparent>
              <Icon name="menu" />
            </Button>
          </Right>
        </Header>
        <Content scrollEnabled={false} style={{ flex: 1 }} contentContainerStyle={{ flex: 1 }}>
          <View style={{ flex: 12 }}>
            <View style={{
                flex: '2.0',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <Text style={{ fontSize: 11, color: red }}>
                Esto es texto de ejemplo, lo que aparece arriba del todo de la pantalla
              </Text>
            </View>
            <View style={{
                flex: '2.0',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <Card>
                <CardItem header>
                  <Text>Carta de ejemplo</Text>
                </CardItem>
                <CardItem>
                  <Body>
                    <Text>Otro componente de ejemplo</Text>
                  </Body>
                </CardItem>
              </Card>
            </View>
            <View style={{ flex: '2.0', flexDirection: 'row' }}>
            <View style={{
                flex: '3.0',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <Item underlined>
                <Input placeholder="Enter text" />
              </Item>
            </View>
            <View style={{
                flex: '1.0',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <Button primary style={{ alignSelf: 'center' }}>
                <Text>Enviar</Text>
              </Button>
            </View>
            </View>
            <View style={{
                flex: '6.0',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <ScrollView>
                <List style={{ flex: 1 }}>
                  <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
                    <Left style={{ flex: 1 }}>
                      <Icon name="md-document" style={{ color: 'blue' }} />
                    </Left>
                    <Body style={{ flex: 8 }}>
                      <Text numberOfLines={1}>Elemento numero 1</Text>
                    </Body>
                    <Right style={{ flex: 1 }}>
                      <Icon name="arrow-forward" style={{ color: 'black' }} />
                    </Right>
                  </ListItem>
                  <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
                    <Left style={{ flex: 1 }}>
                      <Icon name="md-folder" style={{ color: 'red' }} />
                    </Left>
                    <Body style={{ flex: 8 }}>
                      <Text numberOfLines={1}>Elemento numero 2</Text>
                    </Body>
                    <Right style={{ flex: 1 }}>
                      <Icon name="arrow-forward" style={{ color: 'black' }} />
                    </Right>
                  </ListItem>
                  <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
                    <Left style={{ flex: 1 }}>
                      <Icon name="md-link" style={{ color: 'green' }} />
                    </Left>
                    <Body style={{ flex: 8 }}>
                      <Text numberOfLines={1}>Elemento numero 3</Text>
                    </Body>
                    <Right style={{ flex: 1 }}>
                      <Icon name="arrow-forward" style={{ color: 'black' }} />
                    </Right>
                  </ListItem>
                  <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
                    <Body style={{ flex: 9 }}>
                      <Text numberOfLines={1}>Elemento numero 4</Text>
                    </Body>
                    <Right style={{ flex: 1 }}>
                      <Icon name="arrow-forward" style={{ color: 'black' }} />
                    </Right>
                  </ListItem>
                  <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
                    <Left style={{ flex: 1 }}>
                      <Icon name="md-folder" style={{ color: 'red' }} />
                    </Left>
                    <Body style={{ flex: 9 }}>
                      <Text numberOfLines={1}>Elemento numero 5</Text>
                    </Body>
                  </ListItem>
                  <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
                    <Body style={{ flex: 9 }}>
                      <Text numberOfLines={1}>Elemento numero 6</Text>
                    </Body>
                  </ListItem>
                </List>
              </ScrollView>
            </View>
          </View>
        </Content>
      </Container>
    );
  }
}

export default PrimeraPantalla;
