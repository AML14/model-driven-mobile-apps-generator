import React, { Component } from 'react';
import {
  Image,
  View,
  ScrollView,
  AsyncStorage,
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
  Label,
} from 'native-base';
import { NavigationActions } from 'react-navigation';

const navForward = NavigationActions.navigate({
  routeName: 'Navegador2',
  params: {},
  action: {},
});

class PrimeraPantalla extends Component {
  static navigationOptions = {
    header: null,
  }
  
  constructor(props) {
    super(props);
    this.initialState = {
      inputText1: '',
      radioButton3: 'true',
    };
    this.state = this.initialState;
  }
  
  componentDidMount() {
    AsyncStorage.getItem('inputText1')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ inputText1: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.getItem('radioButton3')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          if (value === 'true') {
            this.setState({ radioButton3: true });
          } else {
            this.setState({ radioButton3: false });
          }
        }
      })
      .catch((error) => {
        console.log(error);
      });
  }
  
  saveAndGoForward() {
    AsyncStorage.setItem('inputText1', this.state.inputText1)
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.setItem('radioButton3', this.state.radioButton3.toString())
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    this.props.navigation.dispatch(navForward);
  }
  
  async getInputParams(a, b = null, c = null, d = null, e = null) {
    const a1 = a !== null ? await AsyncStorage.getItem(a.key) : null;
    const b1 = b !== null ? await AsyncStorage.getItem(b.key) : null;
    const c1 = c !== null ? await AsyncStorage.getItem(c.key) : null;
    const d1 = d !== null ? await AsyncStorage.getItem(d.key) : null;
    const e1 = e !== null ? await AsyncStorage.getItem(e.key) : null;
    return {
      a1,
      b1,
      c1,
      d1,
      e1,
    };
  }

  loadCardContentFromExternalSource(a, b, c, d, e) {
    const {
      a1,
      b1,
      c1,
      d1,
      e1,
    } = this.getInputParams(a, b, c, d, e);
    /**
     * Code for retrieving information from an external source using the params passed.
     * The external source could be a server, for instance, which could perform
     * different operations depending on the params' (a1, b1, c1, d1, e1) type and value.
     */
    return (
      <Card>
        <CardItem header>
          <Text>Card example</Text>
        </CardItem>
        <CardItem>
          <Body>
            <Text>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam
              eleifend leo non felis tristique, ac ullamcorper velit accumsan.
              Sed vitae leo ut urna porta laoreet. Praesent in imperdiet sem,
              ut rhoncus lacus. Praesent ultricies quis purus a euismod.
            </Text>
          </Body>
        </CardItem>
      </Card>
    );
  }
  
  loadListContentFromExternalSource(a, b, c, d, e) {
    const {
      a1,
      b1,
      c1,
      d1,
      e1,
    } = this.getInputParams(a, b, c, d, e);
    /**
     * Code for retrieving information from an external source using the params passed.
     * The external source could be a server, for instance, which could perform
     * different operations depending on the params' (a1, b1, c1, d1, e1) type and value.
     */
    return (
      <ScrollView>
        {/* Las listas deben marcar flex=1 dentro de la vista */}
        <List style={{ flex: 1 }}>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Simon Mignolet</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Nathaniel Clyne</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Dejan Lovren</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
        </List>
      </ScrollView>
    );
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }}>
          </Left>
          <Body style={{ flex: 6 }}>
            <Title>Primera Pantalla</Title>
          </Body>
          <Right style={{ flex: 1 }}>
            <Button transparent onPress={() => this.saveAndGoForward()}>
              <Icon name="arrow-forward" />
            </Button>
          </Right>
        </Header>
        <Content scrollEnabled={false} style={{ flex: 1 }} contentContainerStyle={{ flex: 1 }}>
          <View style={{ flex: 12 }}>
            <View style={{
                flex: 2.0,
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <Text style={{ fontSize: 11, color: 'red' }}>
                Esto es texto de ejemplo, lo que aparece arriba del todo de la pantalla
              </Text>
            </View>
            <View style={{
                flex: 2.0,
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
            <View style={{ flex: 2.0, flexDirection: 'row' }}>
            <View style={{
                flex: 3.0,
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <Item underlined>
                <Input
                  placeholder="Enter text"
                  onChangeText={inputText1 => this.setState({ inputText1 })}
                  value={this.state.inputText1}
                />
              </Item>
            </View>
            <View style={{
                flex: 1.0,
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
                flex: 4.0,
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
            <View style={{
                flex: 2.0,
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
              <List style={{ flex: 1 }}>
                <ListItem
                  style={{ marginLeft: 0, paddingLeft: 15 }}
                  onPress={() => this.setState({ radioButton3: !this.state.radioButton3 })}
                >
                  <Body style={{ flex: 9 }}>
                    <Text>Add ketchup</Text>
                  </Body>
                  <Right style={{ flex: 1 }}>
                    <Radio
                      onPress={() => this.setState({ radioButton3: !this.state.radioButton3 })}
                      selected={this.state.radioButton3}
                    />
                  </Right>
                </ListItem>
              </List>
            </View>
          </View>
        </Content>
      </Container>
    );
  }
}

export default PrimeraPantalla;
